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

public val Simpleicons.Macports: ImageVector
    get() {
        if (_macports != null) {
            return _macports!!
        }
        _macports = Builder(name = "Macports", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.055f, 4.154f)
                curveToRelative(-1.323f, 0.0f, -2.395f, 1.16f, -2.395f, 2.593f)
                verticalLineToRelative(10.506f)
                curveToRelative(0.0f, 1.432f, 1.072f, 2.593f, 2.395f, 2.593f)
                horizontalLineToRelative(7.55f)
                curveToRelative(1.323f, 0.0f, 2.395f, -1.161f, 2.395f, -2.593f)
                lineTo(24.0f, 6.747f)
                curveToRelative(0.0f, -1.432f, -1.072f, -2.593f, -2.395f, -2.593f)
                close()
                moveTo(17.659f, 7.158f)
                curveToRelative(1.34f, 0.0f, 2.296f, 0.256f, 2.938f, 0.77f)
                curveToRelative(0.628f, 0.485f, 1.027f, 1.283f, 1.027f, 2.225f)
                curveToRelative(0.0f, 0.941f, -0.3f, 1.754f, -0.884f, 2.282f)
                curveToRelative(-0.742f, 0.685f, -1.84f, 1.013f, -3.124f, 1.013f)
                curveToRelative(-0.285f, 0.0f, -0.542f, -0.015f, -0.741f, -0.057f)
                verticalLineToRelative(3.451f)
                lineTo(14.72f, 16.842f)
                lineTo(14.72f, 7.357f)
                curveToRelative(0.67f, -0.114f, 1.612f, -0.2f, 2.938f, -0.2f)
                close()
                moveTo(0.614f, 7.193f)
                lineTo(0.0f, 16.807f)
                horizontalLineToRelative(2.011f)
                lineToRelative(0.186f, -3.652f)
                curveToRelative(0.057f, -1.198f, 0.114f, -2.681f, 0.156f, -3.979f)
                horizontalLineToRelative(0.029f)
                curveToRelative(0.243f, 1.255f, 0.557f, 2.624f, 0.87f, 3.765f)
                lineTo(4.28f, 16.65f)
                horizontalLineToRelative(1.697f)
                lineToRelative(1.17f, -3.751f)
                arcTo(60.6f, 60.6f, 0.0f, false, false, 8.23f, 9.176f)
                horizontalLineToRelative(0.029f)
                curveToRelative(0.0f, 1.398f, 0.042f, 2.796f, 0.085f, 3.95f)
                lineToRelative(0.157f, 3.68f)
                horizontalLineToRelative(2.11f)
                lineTo(10.1f, 7.194f)
                lineTo(7.246f, 7.194f)
                lineToRelative(-1.013f, 3.195f)
                arcToRelative(53.196f, 53.196f, 0.0f, false, false, -0.913f, 3.452f)
                horizontalLineToRelative(-0.057f)
                arcToRelative(41.43f, 41.43f, 0.0f, false, false, -0.813f, -3.438f)
                lineTo(3.51f, 7.193f)
                close()
                moveTo(17.759f, 8.813f)
                curveToRelative(-0.428f, 0.0f, -0.727f, 0.028f, -0.884f, 0.07f)
                verticalLineToRelative(2.839f)
                curveToRelative(0.185f, 0.043f, 0.399f, 0.057f, 0.727f, 0.057f)
                curveToRelative(1.155f, 0.0f, 1.868f, -0.585f, 1.868f, -1.555f)
                curveToRelative(0.0f, -0.884f, -0.613f, -1.412f, -1.711f, -1.412f)
                close()
            }
        }
        .build()
        return _macports!!
    }

private var _macports: ImageVector? = null
