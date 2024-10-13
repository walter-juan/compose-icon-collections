package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxGlasses: ImageVector
    get() {
        if (_bxGlasses != null) {
            return _bxGlasses!!
        }
        _bxGlasses = Builder(name = "BxGlasses", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.977f, 13.783f)
                lineToRelative(-2.0f, -9.0f)
                arcTo(1.002f, 1.002f, 0.0f, false, false, 19.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.198f)
                lineToRelative(0.961f, 4.326f)
                arcTo(4.467f, 4.467f, 0.0f, false, false, 17.5f, 10.0f)
                curveToRelative(-1.953f, 0.0f, -3.603f, 1.258f, -4.224f, 3.0f)
                horizontalLineToRelative(-2.553f)
                curveToRelative(-0.621f, -1.742f, -2.271f, -3.0f, -4.224f, -3.0f)
                curveToRelative(-0.587f, 0.0f, -1.145f, 0.121f, -1.659f, 0.326f)
                lineTo(5.802f, 6.0f)
                lineTo(8.0f, 6.0f)
                lineTo(8.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.976f, 0.783f)
                lineToRelative(-2.0f, 9.0f)
                lineToRelative(0.047f, 0.011f)
                arcTo(4.552f, 4.552f, 0.0f, false, false, 2.0f, 14.5f)
                curveTo(2.0f, 16.981f, 4.019f, 19.0f, 6.5f, 19.0f)
                curveToRelative(2.31f, 0.0f, 4.197f, -1.756f, 4.449f, -4.0f)
                horizontalLineToRelative(2.102f)
                curveToRelative(0.252f, 2.244f, 2.139f, 4.0f, 4.449f, 4.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                curveToRelative(0.0f, -0.242f, -0.034f, -0.475f, -0.071f, -0.706f)
                lineToRelative(0.048f, -0.011f)
                close()
                moveTo(6.5f, 17.0f)
                curveTo(5.122f, 17.0f, 4.0f, 15.878f, 4.0f, 14.5f)
                reflectiveCurveTo(5.122f, 12.0f, 6.5f, 12.0f)
                reflectiveCurveTo(9.0f, 13.122f, 9.0f, 14.5f)
                reflectiveCurveTo(7.878f, 17.0f, 6.5f, 17.0f)
                close()
                moveTo(17.5f, 17.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.121f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.122f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.121f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _bxGlasses!!
    }

private var _bxGlasses: ImageVector? = null
