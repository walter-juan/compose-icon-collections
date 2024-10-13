package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsOffer: ImageVector
    get() {
        if (_bxsOffer != null) {
            return _bxsOffer!!
        }
        _bxsOffer = Builder(name = "BxsOffer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.749f, 12.0f)
                lineToRelative(1.104f, -1.908f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.365f, -1.366f)
                lineToRelative(-1.91f, -1.104f)
                verticalLineToRelative(-2.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-2.199f)
                lineToRelative(-1.103f, -1.909f)
                arcToRelative(1.008f, 1.008f, 0.0f, false, false, -0.607f, -0.466f)
                arcToRelative(0.993f, 0.993f, 0.0f, false, false, -0.759f, 0.1f)
                lineTo(12.0f, 3.251f)
                lineToRelative(-1.91f, -1.105f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.366f, 0.366f)
                lineTo(7.62f, 4.422f)
                lineTo(5.421f, 4.422f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.199f)
                lineToRelative(-1.91f, 1.104f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, -0.365f, 1.367f)
                lineTo(3.25f, 12.0f)
                lineToRelative(-1.104f, 1.908f)
                arcToRelative(1.004f, 1.004f, 0.0f, false, false, 0.364f, 1.367f)
                lineToRelative(1.91f, 1.104f)
                verticalLineToRelative(2.199f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(2.2f)
                lineToRelative(1.104f, 1.91f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, false, 0.866f, 0.5f)
                curveToRelative(0.174f, 0.0f, 0.347f, -0.046f, 0.501f, -0.135f)
                lineToRelative(1.908f, -1.104f)
                lineToRelative(1.91f, 1.104f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, false, 1.366f, -0.365f)
                lineToRelative(1.103f, -1.91f)
                horizontalLineToRelative(2.199f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-2.199f)
                lineToRelative(1.91f, -1.104f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.365f, -1.367f)
                lineTo(20.749f, 12.0f)
                close()
                moveTo(9.499f, 6.99f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -0.001f, 3.001f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.001f, -3.001f)
                close()
                moveTo(9.799f, 16.59f)
                lineTo(8.199f, 15.391f)
                lineTo(14.199f, 7.391f)
                lineTo(15.799f, 8.59f)
                lineTo(9.799f, 16.59f)
                close()
                moveTo(14.499f, 16.99f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.001f, -3.001f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.001f, 3.001f)
                close()
            }
        }
        .build()
        return _bxsOffer!!
    }

private var _bxsOffer: ImageVector? = null
