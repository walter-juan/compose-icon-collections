package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxMicrophoneOff: ImageVector
    get() {
        if (_bxMicrophoneOff != null) {
            return _bxMicrophoneOff!!
        }
        _bxMicrophoneOff = Builder(name = "BxMicrophoneOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.707f, 20.293f)
                lineToRelative(-3.388f, -3.388f)
                arcTo(7.942f, 7.942f, 0.0f, false, false, 20.0f, 12.021f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(5.95f, 5.95f, 0.0f, false, true, -1.109f, 3.456f)
                lineToRelative(-1.452f, -1.452f)
                curveToRelative(0.348f, -0.591f, 0.561f, -1.27f, 0.561f, -2.004f)
                verticalLineToRelative(-6.0f)
                curveTo(16.0f, 3.804f, 14.215f, 2.0f, 12.021f, 2.0f)
                curveToRelative(-0.07f, 0.0f, -0.14f, 0.009f, -0.209f, 0.025f)
                arcTo(4.005f, 4.005f, 0.0f, false, false, 8.0f, 6.021f)
                verticalLineToRelative(0.565f)
                lineTo(3.707f, 2.293f)
                lineTo(2.293f, 3.707f)
                lineToRelative(18.0f, 18.0f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(10.0f, 6.021f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                arcToRelative(0.918f, 0.918f, 0.0f, false, false, 0.164f, -0.015f)
                curveTo(13.188f, 4.08f, 14.0f, 4.956f, 14.0f, 6.021f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.172f, -0.029f, 0.335f, -0.071f, 0.494f)
                lineTo(10.0f, 8.586f)
                lineTo(10.0f, 6.021f)
                close()
                moveTo(6.0f, 12.021f)
                lineTo(4.0f, 12.021f)
                curveToRelative(0.0f, 4.072f, 3.06f, 7.436f, 7.0f, 7.931f)
                verticalLineToRelative(2.069f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.07f)
                arcToRelative(7.993f, 7.993f, 0.0f, false, false, 2.218f, -0.611f)
                lineToRelative(-1.558f, -1.558f)
                arcToRelative(5.979f, 5.979f, 0.0f, false, true, -1.66f, 0.239f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.692f, -6.0f, -6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.011f, 12.132f)
                arcToRelative(3.993f, 3.993f, 0.0f, false, false, 3.877f, 3.877f)
                lineToRelative(-3.877f, -3.877f)
                close()
            }
        }
        .build()
        return _bxMicrophoneOff!!
    }

private var _bxMicrophoneOff: ImageVector? = null
