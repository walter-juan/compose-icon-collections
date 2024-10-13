package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsChevronLeftCircle: ImageVector
    get() {
        if (_bxsChevronLeftCircle != null) {
            return _bxsChevronLeftCircle!!
        }
        _bxsChevronLeftCircle = Builder(name = "BxsChevronLeftCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(14.707f, 16.293f)
                lineTo(13.293f, 17.707f)
                lineTo(7.586f, 12.0f)
                lineToRelative(5.707f, -5.707f)
                lineToRelative(1.414f, 1.414f)
                lineTo(10.414f, 12.0f)
                lineToRelative(4.293f, 4.293f)
                close()
            }
        }
        .build()
        return _bxsChevronLeftCircle!!
    }

private var _bxsChevronLeftCircle: ImageVector? = null
