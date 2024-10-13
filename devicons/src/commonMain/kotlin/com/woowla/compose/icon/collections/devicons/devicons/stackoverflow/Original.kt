package com.woowla.compose.icon.collections.devicons.devicons.stackoverflow

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
import com.woowla.compose.icon.collections.devicons.devicons.StackoverflowGroup

public val StackoverflowGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(101.07f, 82.51f)
                horizontalLineToRelative(11.38f)
                lineTo(112.45f, 128.0f)
                lineTo(10.05f, 128.0f)
                lineTo(10.05f, 82.51f)
                horizontalLineToRelative(11.38f)
                verticalLineToRelative(34.12f)
                horizontalLineToRelative(79.64f)
                close()
                moveTo(101.07f, 82.51f)
            }
            path(fill = SolidColor(Color(0xFFf58025)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(33.83f, 79.13f)
                lineToRelative(55.88f, 11.74f)
                lineToRelative(2.35f, -11.17f)
                lineToRelative(-55.88f, -11.74f)
                close()
                moveTo(41.22f, 52.38f)
                lineTo(92.99f, 76.48f)
                lineTo(97.81f, 66.13f)
                lineTo(46.04f, 42.03f)
                close()
                moveTo(55.54f, 27.0f)
                lineTo(99.43f, 63.53f)
                lineToRelative(7.31f, -8.77f)
                lineToRelative(-43.88f, -36.53f)
                close()
                moveTo(83.87f, 0.0f)
                lineToRelative(-9.17f, 6.81f)
                lineToRelative(34.08f, 45.8f)
                lineToRelative(9.16f, -6.81f)
                close()
                moveTo(32.8f, 105.25f)
                horizontalLineToRelative(56.89f)
                lineTo(89.69f, 93.88f)
                horizontalLineToRelative(-56.89f)
                close()
                moveTo(32.8f, 105.25f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
