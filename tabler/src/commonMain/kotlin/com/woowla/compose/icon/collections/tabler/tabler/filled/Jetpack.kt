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

public val FilledGroup.Jetpack: ImageVector
    get() {
        if (_jetpack != null) {
            return _jetpack!!
        }
        _jetpack = Builder(name = "Jetpack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                moveToRelative(-4.0f, 8.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(9.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                curveToRelative(0.0f, 2.623f, -0.787f, 4.59f, -2.4f, 5.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.2f, 0.0f)
                curveToRelative(-1.613f, -1.21f, -2.4f, -3.177f, -2.4f, -5.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                curveToRelative(0.0f, 1.532f, 0.308f, 2.684f, 0.906f, 3.498f)
                lineToRelative(0.094f, 0.119f)
                lineToRelative(0.094f, -0.12f)
                curveToRelative(0.558f, -0.759f, 0.864f, -1.813f, 0.902f, -3.196f)
                lineToRelative(0.004f, -0.301f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                moveToRelative(10.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                curveToRelative(0.0f, 2.623f, -0.787f, 4.59f, -2.4f, 5.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.2f, 0.0f)
                curveToRelative(-1.613f, -1.21f, -2.4f, -3.177f, -2.4f, -5.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                curveToRelative(0.0f, 1.532f, 0.308f, 2.684f, 0.906f, 3.498f)
                lineToRelative(0.094f, 0.119f)
                lineToRelative(0.094f, -0.12f)
                curveToRelative(0.558f, -0.759f, 0.864f, -1.813f, 0.902f, -3.196f)
                lineToRelative(0.004f, -0.301f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
            }
        }
        .build()
        return _jetpack!!
    }

private var _jetpack: ImageVector? = null
