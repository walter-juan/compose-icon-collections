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

public val Twbs.SignpostSplit: ImageVector
    get() {
        if (_signpostSplit != null) {
            return _signpostSplit!!
        }
        _signpostSplit = Builder(name = "SignpostSplit", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 7.0f)
                lineTo(7.0f, 1.414f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineTo(9.0f, 2.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.8f, 0.4f)
                lineToRelative(0.975f, 1.3f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.6f)
                lineTo(14.8f, 5.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.8f, 0.4f)
                lineTo(9.0f, 6.0f)
                verticalLineToRelative(10.0f)
                lineTo(7.0f, 16.0f)
                verticalLineToRelative(-5.0f)
                lineTo(2.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.8f, -0.4f)
                lineTo(0.225f, 9.3f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.6f)
                lineTo(1.2f, 7.4f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 7.0f)
                close()
                moveTo(8.0f, 10.0f)
                lineTo(8.0f, 8.0f)
                lineTo(2.0f, 8.0f)
                lineToRelative(-0.75f, 1.0f)
                lineTo(2.0f, 10.0f)
                close()
                moveTo(8.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(0.75f, -1.0f)
                lineTo(14.0f, 3.0f)
                lineTo(8.0f, 3.0f)
                close()
            }
        }
        .build()
        return _signpostSplit!!
    }

private var _signpostSplit: ImageVector? = null
