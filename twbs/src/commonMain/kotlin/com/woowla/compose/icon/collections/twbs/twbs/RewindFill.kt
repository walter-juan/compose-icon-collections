package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.RewindFill: ImageVector
    get() {
        if (_rewindFill != null) {
            return _rewindFill!!
        }
        _rewindFill = Builder(name = "RewindFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.404f, 7.304f)
                arcToRelative(0.802f, 0.802f, 0.0f, false, false, 0.0f, 1.392f)
                lineToRelative(6.363f, 3.692f)
                curveToRelative(0.52f, 0.302f, 1.233f, -0.043f, 1.233f, -0.696f)
                verticalLineTo(4.308f)
                curveToRelative(0.0f, -0.653f, -0.713f, -0.998f, -1.233f, -0.696f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.404f, 7.304f)
                arcToRelative(0.802f, 0.802f, 0.0f, false, false, 0.0f, 1.392f)
                lineToRelative(6.363f, 3.692f)
                curveToRelative(0.52f, 0.302f, 1.233f, -0.043f, 1.233f, -0.696f)
                verticalLineTo(4.308f)
                curveToRelative(0.0f, -0.653f, -0.713f, -0.998f, -1.233f, -0.696f)
                close()
            }
        }
        .build()
        return _rewindFill!!
    }

private var _rewindFill: ImageVector? = null
