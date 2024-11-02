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

public val Simpleicons.Salla: ImageVector
    get() {
        if (_salla != null) {
            return _salla!!
        }
        _salla = Builder(name = "Salla", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.862f, 13.439f)
                arcToRelative(1.27f, 1.27f, 0.0f, false, false, -0.81f, -0.555f)
                arcToRelative(1.27f, 1.27f, 0.0f, false, false, -0.964f, 0.18f)
                curveToRelative(-3.422f, 2.231f, -6.75f, 2.231f, -10.178f, 0.0f)
                arcToRelative(1.27f, 1.27f, 0.0f, false, false, -0.964f, -0.18f)
                arcToRelative(1.283f, 1.283f, 0.0f, false, false, -0.434f, 2.327f)
                curveToRelative(2.142f, 1.394f, 4.326f, 2.1f, 6.49f, 2.1f)
                curveToRelative(2.166f, 0.0f, 4.348f, -0.706f, 6.488f, -2.102f)
                arcToRelative(1.27f, 1.27f, 0.0f, false, false, 0.555f, -0.81f)
                arcToRelative(1.27f, 1.27f, 0.0f, false, false, -0.18f, -0.964f)
                close()
                moveTo(23.965f, 16.259f)
                lineTo(22.794f, 6.495f)
                arcToRelative(5.24f, 5.24f, 0.0f, false, false, -5.2f, -4.614f)
                lineTo(6.406f, 1.881f)
                arcToRelative(5.236f, 5.236f, 0.0f, false, false, -5.198f, 4.612f)
                lineToRelative(-1.17f, 9.766f)
                arcToRelative(5.235f, 5.235f, 0.0f, false, false, 5.198f, 5.86f)
                horizontalLineToRelative(13.529f)
                arcToRelative(5.238f, 5.238f, 0.0f, false, false, 5.198f, -5.86f)
                close()
                moveTo(20.755f, 18.659f)
                curveToRelative(-0.532f, 0.6f, -1.265f, 0.929f, -2.066f, 0.929f)
                lineTo(5.311f, 19.588f)
                curveToRelative(-0.801f, 0.0f, -1.536f, -0.33f, -2.066f, -0.929f)
                arcToRelative(2.73f, 2.73f, 0.0f, false, true, -0.676f, -2.16f)
                lineToRelative(1.157f, -9.657f)
                arcTo(2.764f, 2.764f, 0.0f, false, true, 6.468f, 4.41f)
                horizontalLineToRelative(11.064f)
                arcToRelative(2.765f, 2.765f, 0.0f, false, true, 2.742f, 2.432f)
                lineToRelative(1.157f, 9.656f)
                arcToRelative(2.72f, 2.72f, 0.0f, false, true, -0.676f, 2.161f)
            }
        }
        .build()
        return _salla!!
    }

private var _salla: ImageVector? = null
