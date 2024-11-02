package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Boulanger: ImageVector
    get() {
        if (_boulanger != null) {
            return _boulanger!!
        }
        _boulanger = Builder(name = "Boulanger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.405f, 3.612f)
                verticalLineToRelative(3.578f)
                horizontalLineToRelative(5.662f)
                curveToRelative(2.987f, 0.035f, 5.384f, 2.431f, 5.384f, 5.418f)
                curveToRelative(-0.035f, 2.987f, -2.431f, 5.383f, -5.384f, 5.418f)
                horizontalLineToRelative(-3.126f)
                curveToRelative(-2.987f, 0.0f, -5.418f, -2.431f, -5.418f, -5.418f)
                lineTo(5.523f, 8.405f)
                curveToRelative(0.0f, -2.084f, 1.146f, -3.89f, 2.882f, -4.793f)
                close()
                curveTo(3.786f, 3.612f, 0.0f, 7.398f, 0.0f, 12.017f)
                curveToRelative(0.0f, 4.619f, 3.716f, 8.371f, 8.37f, 8.371f)
                horizontalLineToRelative(7.259f)
                curveTo(20.249f, 20.388f, 24.0f, 16.671f, 24.0f, 12.017f)
                curveToRelative(0.0f, -4.654f, -3.681f, -8.405f, -8.37f, -8.405f)
                close()
                moveTo(8.44f, 10.038f)
                verticalLineToRelative(2.536f)
                curveToRelative(0.0f, 1.389f, 1.146f, 2.535f, 2.535f, 2.535f)
                horizontalLineToRelative(3.022f)
                curveToRelative(1.389f, 0.0f, 2.535f, -1.146f, 2.535f, -2.535f)
                curveToRelative(0.0f, -1.389f, -1.111f, -2.536f, -2.535f, -2.536f)
                close()
            }
        }
        .build()
        return _boulanger!!
    }

private var _boulanger: ImageVector? = null
