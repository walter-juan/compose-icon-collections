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

public val SolidGroup.Pause: ImageVector
    get() {
        if (_pause != null) {
            return _pause!!
        }
        _pause = Builder(name = "Pause", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.75f, 5.25f)
                curveTo(6.75f, 4.836f, 7.086f, 4.5f, 7.5f, 4.5f)
                horizontalLineTo(9.0f)
                curveTo(9.414f, 4.5f, 9.75f, 4.836f, 9.75f, 5.25f)
                verticalLineTo(18.75f)
                curveTo(9.75f, 19.164f, 9.414f, 19.5f, 9.0f, 19.5f)
                horizontalLineTo(7.5f)
                curveTo(7.301f, 19.5f, 7.11f, 19.421f, 6.97f, 19.28f)
                curveTo(6.829f, 19.14f, 6.75f, 18.949f, 6.75f, 18.75f)
                lineTo(6.75f, 5.25f)
                close()
                moveTo(14.25f, 5.25f)
                curveTo(14.25f, 4.836f, 14.586f, 4.5f, 15.0f, 4.5f)
                horizontalLineTo(16.5f)
                curveTo(16.699f, 4.5f, 16.89f, 4.579f, 17.03f, 4.72f)
                curveTo(17.171f, 4.86f, 17.25f, 5.051f, 17.25f, 5.25f)
                verticalLineTo(18.75f)
                curveTo(17.25f, 19.164f, 16.914f, 19.5f, 16.5f, 19.5f)
                horizontalLineTo(15.0f)
                curveTo(14.586f, 19.5f, 14.25f, 19.164f, 14.25f, 18.75f)
                verticalLineTo(5.25f)
                close()
            }
        }
        .build()
        return _pause!!
    }

private var _pause: ImageVector? = null
