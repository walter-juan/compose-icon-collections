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

public val Twbs.ModemFill: ImageVector
    get() {
        if (_modemFill != null) {
            return _modemFill!!
        }
        _modemFill = Builder(name = "ModemFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.404f, 1.497f)
                curveToRelative(-0.35f, 0.305f, -0.872f, 0.678f, -1.628f, 1.056f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 5.5f, 16.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.224f, -0.947f)
                curveToRelative(-0.756f, -0.378f, -1.278f, -0.75f, -1.628f, -1.056f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.5f, 12.5f)
                verticalLineToRelative(-11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.0f, 0.0f)
                close()
                moveTo(8.0f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, -1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                moveToRelative(0.0f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, -1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                moveToRelative(0.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                moveTo(8.0f, 9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, -1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
            }
        }
        .build()
        return _modemFill!!
    }

private var _modemFill: ImageVector? = null
