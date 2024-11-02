package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.ExclamationTriangle: ImageVector
    get() {
        if (_exclamationTriangle != null) {
            return _exclamationTriangle!!
        }
        _exclamationTriangle = Builder(name = "ExclamationTriangle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.401f, 3.003f)
                curveTo(10.556f, 1.002f, 13.444f, 1.002f, 14.598f, 3.003f)
                lineTo(21.953f, 15.751f)
                curveTo(23.107f, 17.751f, 21.663f, 20.25f, 19.354f, 20.25f)
                horizontalLineTo(4.645f)
                curveTo(2.336f, 20.25f, 0.893f, 17.751f, 2.047f, 15.751f)
                lineTo(9.401f, 3.003f)
                close()
                moveTo(12.0f, 8.25f)
                curveTo(12.414f, 8.25f, 12.75f, 8.586f, 12.75f, 9.0f)
                verticalLineTo(12.75f)
                curveTo(12.75f, 13.164f, 12.414f, 13.5f, 12.0f, 13.5f)
                curveTo(11.586f, 13.5f, 11.25f, 13.164f, 11.25f, 12.75f)
                verticalLineTo(9.0f)
                curveTo(11.25f, 8.586f, 11.586f, 8.25f, 12.0f, 8.25f)
                close()
                moveTo(12.0f, 16.5f)
                curveTo(12.414f, 16.5f, 12.75f, 16.164f, 12.75f, 15.75f)
                curveTo(12.75f, 15.336f, 12.414f, 15.0f, 12.0f, 15.0f)
                curveTo(11.586f, 15.0f, 11.25f, 15.336f, 11.25f, 15.75f)
                curveTo(11.25f, 16.164f, 11.586f, 16.5f, 12.0f, 16.5f)
                close()
            }
        }
        .build()
        return _exclamationTriangle!!
    }

private var _exclamationTriangle: ImageVector? = null
