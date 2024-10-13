package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlMarkdown: ImageVector
    get() {
        if (_bxlMarkdown != null) {
            return _bxlMarkdown!!
        }
        _bxlMarkdown = Builder(name = "BxlMarkdown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.553f, 18.15f)
                horizontalLineTo(3.447f)
                arcToRelative(1.443f, 1.443f, 0.0f, false, true, -1.442f, -1.441f)
                verticalLineTo(7.291f)
                curveToRelative(0.0f, -0.795f, 0.647f, -1.441f, 1.442f, -1.441f)
                horizontalLineToRelative(17.105f)
                curveToRelative(0.795f, 0.0f, 1.442f, 0.646f, 1.442f, 1.441f)
                verticalLineToRelative(9.418f)
                arcToRelative(1.441f, 1.441f, 0.0f, false, true, -1.441f, 1.441f)
                close()
                moveTo(6.811f, 15.268f)
                verticalLineTo(11.52f)
                lineToRelative(1.922f, 2.402f)
                lineToRelative(1.922f, -2.402f)
                verticalLineToRelative(3.748f)
                horizontalLineToRelative(1.922f)
                verticalLineTo(8.732f)
                horizontalLineToRelative(-1.922f)
                lineToRelative(-1.922f, 2.403f)
                lineToRelative(-1.922f, -2.403f)
                horizontalLineTo(4.889f)
                verticalLineToRelative(6.535f)
                horizontalLineToRelative(1.922f)
                close()
                moveTo(19.688f, 12.0f)
                horizontalLineToRelative(-1.922f)
                verticalLineTo(8.732f)
                horizontalLineToRelative(-1.923f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(-1.922f)
                lineToRelative(2.884f, 3.364f)
                lineTo(19.688f, 12.0f)
                close()
            }
        }
        .build()
        return _bxlMarkdown!!
    }

private var _bxlMarkdown: ImageVector? = null
