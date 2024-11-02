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

public val Simpleicons.Meizu: ImageVector
    get() {
        if (_meizu != null) {
            return _meizu!!
        }
        _meizu = Builder(name = "Meizu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.045f, 18.818f)
                horizontalLineToRelative(3.546f)
                arcTo(0.41f, 0.41f, 0.0f, false, false, 24.0f, 18.41f)
                verticalLineToRelative(-3.545f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.41f, -0.41f)
                horizontalLineToRelative(-3.545f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.409f, 0.41f)
                verticalLineToRelative(3.545f)
                curveToRelative(0.0f, 0.226f, 0.184f, 0.41f, 0.41f, 0.41f)
                close()
                moveTo(13.8f, 12.11f)
                arcToRelative(0.095f, 0.095f, 0.0f, false, true, -0.163f, -0.068f)
                verticalLineTo(5.591f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.409f, -0.41f)
                horizontalLineTo(10.59f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, false, -0.385f, 0.16f)
                lineTo(0.16f, 15.387f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, false, -0.16f, 0.385f)
                verticalLineToRelative(2.638f)
                curveToRelative(0.0f, 0.226f, 0.183f, 0.41f, 0.41f, 0.41f)
                horizontalLineToRelative(2.637f)
                arcToRelative(0.547f, 0.547f, 0.0f, false, false, 0.385f, -0.16f)
                lineToRelative(6.769f, -6.769f)
                arcToRelative(0.096f, 0.096f, 0.0f, false, true, 0.163f, 0.068f)
                verticalLineToRelative(6.451f)
                curveToRelative(0.0f, 0.226f, 0.183f, 0.41f, 0.409f, 0.41f)
                horizontalLineToRelative(2.638f)
                arcToRelative(0.547f, 0.547f, 0.0f, false, false, 0.385f, -0.16f)
                lineTo(23.84f, 8.613f)
                arcTo(0.545f, 0.545f, 0.0f, false, false, 24.0f, 8.23f)
                verticalLineTo(5.59f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.41f, -0.41f)
                horizontalLineToRelative(-2.637f)
                arcToRelative(0.546f, 0.546f, 0.0f, false, false, -0.386f, 0.16f)
                close()
            }
        }
        .build()
        return _meizu!!
    }

private var _meizu: ImageVector? = null
