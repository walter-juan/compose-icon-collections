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

public val Simpleicons.Farcaster: ImageVector
    get() {
        if (_farcaster != null) {
            return _farcaster!!
        }
        _farcaster = Builder(name = "Farcaster", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.24f, 0.24f)
                horizontalLineTo(5.76f)
                curveTo(2.579f, 0.24f, 0.0f, 2.819f, 0.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 3.181f, 2.579f, 5.76f, 5.76f, 5.76f)
                horizontalLineToRelative(12.48f)
                curveToRelative(3.181f, 0.0f, 5.76f, -2.579f, 5.76f, -5.76f)
                verticalLineTo(6.0f)
                curveTo(24.0f, 2.819f, 21.421f, 0.24f, 18.24f, 0.24f)
                moveToRelative(0.816f, 17.166f)
                verticalLineToRelative(0.504f)
                curveToRelative(0.287f, -0.026f, 0.546f, 0.191f, 0.544f, 0.479f)
                verticalLineToRelative(0.569f)
                horizontalLineToRelative(-5.144f)
                verticalLineToRelative(-0.569f)
                curveToRelative(-0.002f, -0.289f, 0.258f, -0.505f, 0.544f, -0.479f)
                verticalLineToRelative(-0.504f)
                curveToRelative(0.0f, -0.22f, 0.153f, -0.402f, 0.358f, -0.458f)
                lineToRelative(-0.009f, -4.365f)
                curveToRelative(-0.159f, -1.737f, -1.64f, -3.098f, -3.444f, -3.098f)
                curveToRelative(-1.804f, 0.0f, -3.285f, 1.361f, -3.444f, 3.098f)
                lineToRelative(-0.01f, 4.358f)
                curveToRelative(0.228f, 0.042f, 0.532f, 0.208f, 0.539f, 0.465f)
                verticalLineToRelative(0.504f)
                curveToRelative(0.286f, -0.026f, 0.546f, 0.191f, 0.544f, 0.479f)
                verticalLineToRelative(0.569f)
                horizontalLineTo(4.391f)
                verticalLineToRelative(-0.569f)
                curveToRelative(-0.002f, -0.289f, 0.257f, -0.505f, 0.544f, -0.479f)
                verticalLineToRelative(-0.504f)
                curveToRelative(0.0f, -0.253f, 0.201f, -0.455f, 0.454f, -0.472f)
                verticalLineToRelative(-7.895f)
                horizontalLineToRelative(-0.491f)
                lineTo(4.29f, 7.008f)
                lineToRelative(2.641f, -0.001f)
                verticalLineTo(5.042f)
                horizontalLineToRelative(9.95f)
                verticalLineToRelative(1.966f)
                horizontalLineToRelative(2.822f)
                lineToRelative(-0.609f, 2.031f)
                horizontalLineToRelative(-0.49f)
                verticalLineToRelative(7.895f)
                curveToRelative(0.252f, 0.018f, 0.453f, 0.22f, 0.453f, 0.472f)
            }
        }
        .build()
        return _farcaster!!
    }

private var _farcaster: ImageVector? = null
