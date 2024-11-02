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

public val Simpleicons.Snowpack: ImageVector
    get() {
        if (_snowpack != null) {
            return _snowpack!!
        }
        _snowpack = Builder(name = "Snowpack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.809f, 19.751f)
                lineToRelative(-10.8f, -16.8f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -2.019f, 0.0f)
                lineTo(0.191f, 19.751f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -0.044f, 1.224f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, 1.053f, 0.625f)
                horizontalLineTo(22.8f)
                curveToRelative(0.439f, 0.0f, 0.843f, -0.24f, 1.053f, -0.625f)
                arcToRelative(1.199f, 1.199f, 0.0f, false, false, -0.044f, -1.224f)
                close()
                moveTo(12.0f, 5.819f)
                lineTo(15.202f, 10.8f)
                horizontalLineTo(12.0f)
                lineToRelative(-2.4f, 2.4f)
                lineToRelative(-1.427f, -1.427f)
                close()
            }
        }
        .build()
        return _snowpack!!
    }

private var _snowpack: ImageVector? = null
