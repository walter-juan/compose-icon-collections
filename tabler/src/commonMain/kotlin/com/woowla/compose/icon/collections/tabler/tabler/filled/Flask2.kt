package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.Flask2: ImageVector
    get() {
        if (_flask2 != null) {
            return _flask2!!
        }
        _flask2 = Builder(name = "Flask2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                verticalLineToRelative(5.674f)
                lineToRelative(0.062f, 0.03f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 3.85f, 5.174f)
                lineToRelative(0.037f, 0.262f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -3.078f, 6.693f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.553f, 0.167f)
                horizontalLineToRelative(-6.635f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.552f, -0.166f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 0.807f, -12.134f)
                lineToRelative(0.062f, -0.028f)
                verticalLineToRelative(-5.672f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(13.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.34f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.551f, 0.894f)
                lineToRelative(-0.116f, 0.049f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -2.92f, 2.717f)
                horizontalLineToRelative(9.172f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -2.918f, -2.715f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.667f, -0.943f)
                verticalLineToRelative(-6.342f)
                close()
            }
        }
        .build()
        return _flask2!!
    }

private var _flask2: ImageVector? = null
