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

public val Simpleicons.Developmentcontainers: ImageVector
    get() {
        if (_developmentcontainers != null) {
            return _developmentcontainers!!
        }
        _developmentcontainers = Builder(name = "Developmentcontainers", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.31f, 0.615f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 3.382f, 0.0f)
                lineToRelative(8.998f, 3.648f)
                arcTo(2.1f, 2.1f, 0.0f, false, true, 24.0f, 6.208f)
                verticalLineToRelative(11.584f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, -1.311f, 1.946f)
                lineToRelative(-8.998f, 3.648f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -3.382f, 0.0f)
                lineToRelative(-8.998f, -3.648f)
                arcTo(2.1f, 2.1f, 0.0f, false, true, 0.0f, 17.792f)
                lineTo(0.0f, 6.208f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 1.311f, -1.946f)
                close()
                moveTo(13.015f, 2.283f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, false, -2.028f, 0.0f)
                lineToRelative(-9.0f, 3.647f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, -0.187f, 0.278f)
                verticalLineToRelative(11.584f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, 0.187f, 0.278f)
                lineToRelative(8.999f, 3.648f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, false, 2.028f, 0.0f)
                lineToRelative(8.999f, -3.648f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, 0.187f, -0.278f)
                lineTo(22.2f, 6.208f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, -0.187f, -0.278f)
                close()
                moveTo(6.019f, 6.658f)
                lineTo(12.0f, 8.928f)
                lineToRelative(5.98f, -2.27f)
                curveToRelative(1.122f, -0.427f, 1.762f, 1.256f, 0.64f, 1.683f)
                lineToRelative(-5.72f, 2.17f)
                lineTo(12.9f, 17.1f)
                curveToRelative(0.0f, 1.2f, -1.8f, 1.2f, -1.8f, 0.0f)
                verticalLineToRelative(-6.59f)
                lineTo(5.38f, 8.34f)
                curveToRelative(-1.122f, -0.426f, -0.482f, -2.109f, 0.64f, -1.683f)
            }
        }
        .build()
        return _developmentcontainers!!
    }

private var _developmentcontainers: ImageVector? = null
