package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.BadgeCcFill: ImageVector
    get() {
        if (_badgeCcFill != null) {
            return _badgeCcFill!!
        }
        _badgeCcFill = Builder(name = "BadgeCcFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(16.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(5.027f, 6.002f)
                curveToRelative(-0.83f, 0.0f, -1.319f, 0.642f, -1.319f, 1.753f)
                verticalLineToRelative(0.743f)
                curveToRelative(0.0f, 1.107f, 0.48f, 1.727f, 1.319f, 1.727f)
                curveToRelative(0.69f, 0.0f, 1.138f, -0.435f, 1.186f, -1.05f)
                lineTo(7.36f, 9.175f)
                verticalLineToRelative(0.114f)
                curveToRelative(-0.057f, 1.147f, -1.028f, 1.938f, -2.342f, 1.938f)
                curveToRelative(-1.613f, 0.0f, -2.518f, -1.028f, -2.518f, -2.729f)
                verticalLineToRelative(-0.747f)
                curveTo(2.5f, 6.051f, 3.414f, 5.0f, 5.018f, 5.0f)
                curveToRelative(1.318f, 0.0f, 2.29f, 0.813f, 2.342f, 2.0f)
                verticalLineToRelative(0.11f)
                lineTo(6.213f, 7.11f)
                curveToRelative(-0.048f, -0.638f, -0.505f, -1.108f, -1.186f, -1.108f)
                moveToRelative(6.14f, 0.0f)
                curveToRelative(-0.831f, 0.0f, -1.319f, 0.642f, -1.319f, 1.753f)
                verticalLineToRelative(0.743f)
                curveToRelative(0.0f, 1.107f, 0.48f, 1.727f, 1.318f, 1.727f)
                curveToRelative(0.69f, 0.0f, 1.139f, -0.435f, 1.187f, -1.05f)
                lineTo(13.5f, 9.175f)
                verticalLineToRelative(0.114f)
                curveToRelative(-0.057f, 1.147f, -1.028f, 1.938f, -2.342f, 1.938f)
                curveToRelative(-1.613f, 0.0f, -2.518f, -1.028f, -2.518f, -2.729f)
                verticalLineToRelative(-0.747f)
                curveToRelative(0.0f, -1.7f, 0.914f, -2.751f, 2.518f, -2.751f)
                curveToRelative(1.318f, 0.0f, 2.29f, 0.813f, 2.342f, 2.0f)
                verticalLineToRelative(0.11f)
                horizontalLineToRelative(-1.147f)
                curveToRelative(-0.048f, -0.638f, -0.505f, -1.108f, -1.187f, -1.108f)
                close()
            }
        }
        .build()
        return _badgeCcFill!!
    }

private var _badgeCcFill: ImageVector? = null
