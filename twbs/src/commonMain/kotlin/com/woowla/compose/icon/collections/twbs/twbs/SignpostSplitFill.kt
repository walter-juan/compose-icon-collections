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

public val Twbs.SignpostSplitFill: ImageVector
    get() {
        if (_signpostSplitFill != null) {
            return _signpostSplitFill!!
        }
        _signpostSplitFill = Builder(name = "SignpostSplitFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.8f, -0.4f)
                lineToRelative(0.975f, -1.3f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.6f)
                lineTo(14.8f, 2.4f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 2.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-0.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.8f, 0.4f)
                lineTo(0.225f, 8.7f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.6f)
                lineToRelative(0.975f, 1.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.8f, 0.4f)
                horizontalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _signpostSplitFill!!
    }

private var _signpostSplitFill: ImageVector? = null
