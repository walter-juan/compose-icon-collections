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

public val Twbs.TypeStrikethrough: ImageVector
    get() {
        if (_typeStrikethrough != null) {
            return _typeStrikethrough!!
        }
        _typeStrikethrough = Builder(name = "TypeStrikethrough", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.333f, 5.686f)
                curveToRelative(0.0f, 0.31f, 0.083f, 0.581f, 0.27f, 0.814f)
                lineTo(5.166f, 6.5f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, -0.099f, -0.76f)
                curveToRelative(0.0f, -1.627f, 1.436f, -2.768f, 3.48f, -2.768f)
                curveToRelative(1.969f, 0.0f, 3.39f, 1.175f, 3.445f, 2.85f)
                horizontalLineToRelative(-1.23f)
                curveToRelative(-0.11f, -1.08f, -0.964f, -1.743f, -2.25f, -1.743f)
                curveToRelative(-1.23f, 0.0f, -2.18f, 0.602f, -2.18f, 1.607f)
                close()
                moveTo(8.527f, 13.164f)
                curveToRelative(-2.153f, 0.0f, -3.589f, -1.107f, -3.705f, -2.81f)
                horizontalLineToRelative(1.23f)
                curveToRelative(0.144f, 1.06f, 1.129f, 1.703f, 2.544f, 1.703f)
                curveToRelative(1.34f, 0.0f, 2.31f, -0.705f, 2.31f, -1.675f)
                curveToRelative(0.0f, -0.827f, -0.547f, -1.374f, -1.914f, -1.675f)
                lineTo(8.046f, 8.5f)
                lineTo(1.0f, 8.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.504f)
                curveToRelative(0.468f, 0.437f, 0.675f, 0.994f, 0.675f, 1.697f)
                curveToRelative(0.0f, 1.826f, -1.436f, 2.967f, -3.644f, 2.967f)
            }
        }
        .build()
        return _typeStrikethrough!!
    }

private var _typeStrikethrough: ImageVector? = null
