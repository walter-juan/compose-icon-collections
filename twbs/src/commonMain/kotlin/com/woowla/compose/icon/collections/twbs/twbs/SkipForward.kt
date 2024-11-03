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

public val Twbs.SkipForward: ImageVector
    get() {
        if (_skipForward != null) {
            return _skipForward!!
        }
        _skipForward = Builder(name = "SkipForward", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                lineTo(15.0f, 8.752f)
                lineToRelative(-6.267f, 3.636f)
                curveToRelative(-0.52f, 0.302f, -1.233f, -0.043f, -1.233f, -0.696f)
                verticalLineToRelative(-2.94f)
                lineToRelative(-6.267f, 3.636f)
                curveTo(0.713f, 12.69f, 0.0f, 12.345f, 0.0f, 11.692f)
                lineTo(0.0f, 4.308f)
                curveToRelative(0.0f, -0.653f, 0.713f, -0.998f, 1.233f, -0.696f)
                lineTo(7.5f, 7.248f)
                verticalLineToRelative(-2.94f)
                curveToRelative(0.0f, -0.653f, 0.713f, -0.998f, 1.233f, -0.696f)
                lineTo(15.0f, 7.248f)
                lineTo(15.0f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                moveTo(1.0f, 4.633f)
                verticalLineToRelative(6.734f)
                lineTo(6.804f, 8.0f)
                close()
                moveTo(8.5f, 4.633f)
                verticalLineToRelative(6.734f)
                lineTo(14.304f, 8.0f)
                close()
            }
        }
        .build()
        return _skipForward!!
    }

private var _skipForward: ImageVector? = null
