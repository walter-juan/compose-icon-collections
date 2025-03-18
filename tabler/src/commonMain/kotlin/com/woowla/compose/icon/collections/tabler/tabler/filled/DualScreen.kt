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

public val FilledGroup.DualScreen: ImageVector
    get() {
        if (_dualScreen != null) {
            return _dualScreen!!
        }
        _dualScreen = Builder(name = "DualScreen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.351f, 0.936f)
                lineToRelative(-8.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.649f, -0.936f)
                verticalLineToRelative(-15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.212f, -0.616f)
                lineToRelative(0.068f, -0.079f)
                lineToRelative(0.078f, -0.072f)
                lineToRelative(0.066f, -0.05f)
                lineToRelative(0.092f, -0.058f)
                lineToRelative(0.065f, -0.033f)
                lineToRelative(0.1f, -0.04f)
                lineToRelative(0.099f, -0.028f)
                lineToRelative(0.046f, -0.01f)
                lineToRelative(0.108f, -0.013f)
                lineToRelative(0.066f, -0.001f)
                close()
                moveTo(13.351f, 6.064f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.649f, 0.936f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(-7.486f)
                close()
            }
        }
        .build()
        return _dualScreen!!
    }

private var _dualScreen: ImageVector? = null
