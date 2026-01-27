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

public val Simpleicons.Labex: ImageVector
    get() {
        if (_labex != null) {
            return _labex!!
        }
        _labex = Builder(name = "Labex", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.2f, 0.0f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, 1.2f, 1.2f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, -1.2f, 1.2f)
                horizontalLineToRelative(-0.402f)
                verticalLineToRelative(1.212f)
                lineToRelative(6.976f, 9.687f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, 0.22f, 0.576f)
                lineTo(24.0f, 18.0f)
                verticalLineToRelative(4.8f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, -1.2f, 1.2f)
                lineTo(1.2f, 24.0f)
                arcTo(1.2f, 1.2f, 0.0f, false, true, 0.0f, 22.8f)
                lineTo(0.0f, 18.0f)
                curveToRelative(0.0f, -0.252f, 0.08f, -0.497f, 0.226f, -0.701f)
                lineToRelative(6.975f, -9.687f)
                lineTo(7.201f, 6.4f)
                lineTo(6.8f, 6.4f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, -1.194f, -1.084f)
                lineTo(5.6f, 5.2f)
                verticalLineToRelative(-4.0f)
                arcTo(1.2f, 1.2f, 0.0f, false, true, 6.8f, 0.0f)
                close()
                moveTo(16.0f, 2.4f)
                lineTo(8.0f, 2.4f)
                lineTo(8.0f, 4.0f)
                horizontalLineToRelative(0.4f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, 1.195f, 1.084f)
                lineToRelative(0.006f, 0.116f)
                verticalLineToRelative(2.703f)
                curveToRelative(0.0f, 0.315f, -0.1f, 0.622f, -0.283f, 0.877f)
                lineTo(2.4f, 18.386f)
                lineTo(2.4f, 21.6f)
                horizontalLineToRelative(19.2f)
                verticalLineToRelative(-3.213f)
                lineTo(14.681f, 8.78f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.277f, -0.743f)
                lineToRelative(-0.006f, -0.134f)
                lineTo(14.398f, 5.2f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, 1.2f, -1.2f)
                lineTo(16.0f, 4.0f)
                close()
                moveTo(15.52f, 16.8f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, 0.0f, 2.4f)
                horizontalLineToRelative(-2.88f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, 0.0f, -2.4f)
                close()
                moveTo(9.383f, 12.351f)
                lineTo(11.518f, 14.486f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, 0.0f, 1.697f)
                lineToRelative(-2.135f, 2.135f)
                arcToRelative(1.2f, 1.2f, 0.0f, true, true, -1.697f, -1.697f)
                lineToRelative(1.286f, -1.286f)
                lineToRelative(-1.286f, -1.286f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, -0.078f, -1.612f)
                lineToRelative(0.078f, -0.086f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, 1.697f, 0.0f)
            }
        }
        .build()
        return _labex!!
    }

private var _labex: ImageVector? = null
