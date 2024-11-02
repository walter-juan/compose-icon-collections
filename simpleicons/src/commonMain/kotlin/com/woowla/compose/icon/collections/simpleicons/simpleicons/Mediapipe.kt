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

public val Simpleicons.Mediapipe: ImageVector
    get() {
        if (_mediapipe != null) {
            return _mediapipe!!
        }
        _mediapipe = Builder(name = "Mediapipe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.182f, 0.0f)
                curveTo(1.0f, 0.0f, 0.037f, 0.94f, 0.002f, 2.114f)
                lineTo(0.0f, 2.182f)
                verticalLineToRelative(6.545f)
                arcToRelative(2.182f, 2.182f, 0.0f, false, false, 4.364f, 0.0f)
                lineTo(4.364f, 2.182f)
                arcTo(2.182f, 2.182f, 0.0f, false, false, 2.182f, 0.0f)
                close()
                moveTo(8.727f, 0.0f)
                curveToRelative(-1.182f, 0.0f, -2.145f, 0.94f, -2.18f, 2.114f)
                lineToRelative(-0.002f, 0.068f)
                verticalLineToRelative(13.09f)
                arcToRelative(2.182f, 2.182f, 0.0f, false, false, 4.364f, 0.0f)
                lineTo(10.909f, 2.183f)
                arcTo(2.182f, 2.182f, 0.0f, false, false, 8.727f, 0.0f)
                close()
                moveTo(15.273f, 0.0f)
                arcToRelative(2.182f, 2.182f, 0.0f, false, false, -2.182f, 2.182f)
                arcToRelative(2.182f, 2.182f, 0.0f, false, false, 2.182f, 2.182f)
                arcToRelative(2.182f, 2.182f, 0.0f, false, false, 2.182f, -2.182f)
                arcTo(2.182f, 2.182f, 0.0f, false, false, 15.273f, 0.0f)
                close()
                moveTo(21.818f, 0.0f)
                curveToRelative(-1.182f, 0.0f, -2.145f, 0.94f, -2.18f, 2.114f)
                lineToRelative(-0.002f, 0.068f)
                verticalLineToRelative(19.636f)
                arcToRelative(2.182f, 2.182f, 0.0f, false, false, 4.364f, 0.0f)
                lineTo(24.0f, 2.182f)
                arcTo(2.182f, 2.182f, 0.0f, false, false, 21.818f, 0.0f)
                close()
                moveTo(15.273f, 6.545f)
                curveToRelative(-1.183f, 0.0f, -2.145f, 0.94f, -2.181f, 2.114f)
                lineToRelative(-0.001f, 0.068f)
                verticalLineToRelative(13.091f)
                arcToRelative(2.182f, 2.182f, 0.0f, false, false, 4.364f, 0.0f)
                lineTo(17.455f, 8.728f)
                arcToRelative(2.182f, 2.182f, 0.0f, false, false, -2.182f, -2.183f)
                close()
                moveTo(2.182f, 13.091f)
                curveToRelative(-1.182f, 0.0f, -2.145f, 0.94f, -2.18f, 2.114f)
                lineTo(0.0f, 15.273f)
                verticalLineToRelative(6.545f)
                arcToRelative(2.182f, 2.182f, 0.0f, false, false, 4.364f, 0.0f)
                verticalLineToRelative(-6.545f)
                arcToRelative(2.182f, 2.182f, 0.0f, false, false, -2.182f, -2.182f)
                close()
                moveTo(8.727f, 19.636f)
                arcToRelative(2.182f, 2.182f, 0.0f, false, false, -2.182f, 2.182f)
                arcTo(2.182f, 2.182f, 0.0f, false, false, 8.727f, 24.0f)
                arcToRelative(2.182f, 2.182f, 0.0f, false, false, 2.182f, -2.182f)
                arcToRelative(2.182f, 2.182f, 0.0f, false, false, -2.182f, -2.182f)
                close()
            }
        }
        .build()
        return _mediapipe!!
    }

private var _mediapipe: ImageVector? = null
