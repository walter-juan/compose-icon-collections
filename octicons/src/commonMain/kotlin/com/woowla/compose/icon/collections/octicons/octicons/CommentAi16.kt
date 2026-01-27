package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.CommentAi16: ImageVector
    get() {
        if (_commentAi16 != null) {
            return _commentAi16!!
        }
        _commentAi16 = Builder(name = "CommentAi16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.75f, 1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.199f, 0.0f, 0.39f, 0.079f, 0.53f, 0.22f)
                curveToRelative(0.141f, 0.14f, 0.22f, 0.331f, 0.22f, 0.53f)
                verticalLineToRelative(2.19f)
                lineToRelative(2.72f, -2.72f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, 0.53f, -0.22f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.464f, -0.184f, 0.909f, -0.513f, 1.237f)
                arcTo(1.746f, 1.746f, 0.0f, false, true, 13.25f, 12.0f)
                lineTo(9.06f, 12.0f)
                lineToRelative(-2.573f, 2.573f)
                arcTo(1.457f, 1.457f, 0.0f, false, true, 4.0f, 13.543f)
                lineTo(4.0f, 12.0f)
                lineTo(2.75f, 12.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 1.0f, 10.25f)
                verticalLineToRelative(-7.5f)
                curveTo(1.0f, 1.784f, 1.784f, 1.0f, 2.75f, 1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(12.269f, 0.163f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, true, 0.466f, 0.0f)
                lineToRelative(0.238f, 0.648f)
                arcToRelative(3.726f, 3.726f, 0.0f, false, false, 2.218f, 2.219f)
                lineToRelative(0.649f, 0.238f)
                arcToRelative(0.249f, 0.249f, 0.0f, false, true, 0.0f, 0.467f)
                lineToRelative(-0.649f, 0.238f)
                arcToRelative(3.725f, 3.725f, 0.0f, false, false, -2.218f, 2.218f)
                lineToRelative(-0.238f, 0.649f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, true, -0.466f, 0.0f)
                lineToRelative(-0.239f, -0.649f)
                arcToRelative(3.725f, 3.725f, 0.0f, false, false, -2.218f, -2.218f)
                lineToRelative(-0.649f, -0.238f)
                arcToRelative(0.249f, 0.249f, 0.0f, false, true, 0.0f, -0.467f)
                lineToRelative(0.649f, -0.238f)
                arcTo(3.726f, 3.726f, 0.0f, false, false, 12.03f, 0.811f)
                lineToRelative(0.239f, -0.648f)
                close()
            }
        }
        .build()
        return _commentAi16!!
    }

private var _commentAi16: ImageVector? = null
