package com.woowla.compose.icon.collections.boxicons.boxicons.solid

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
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsMicrophoneOff: ImageVector
    get() {
        if (_bxsMicrophoneOff != null) {
            return _bxsMicrophoneOff!!
        }
        _bxsMicrophoneOff = Builder(name = "BxsMicrophoneOff", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.707f, 20.293f)
                lineToRelative(-3.4f, -3.4f)
                arcTo(7.93f, 7.93f, 0.0f, false, false, 20.0f, 12.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(5.945f, 5.945f, 0.0f, false, true, -1.119f, 3.467f)
                lineToRelative(-1.449f, -1.45f)
                arcTo(3.926f, 3.926f, 0.0f, false, false, 16.0f, 12.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -2.217f, -1.785f, -4.021f, -3.979f, -4.021f)
                curveToRelative(-0.07f, 0.0f, -0.14f, 0.009f, -0.209f, 0.025f)
                arcTo(4.006f, 4.006f, 0.0f, false, false, 8.0f, 6.0f)
                verticalLineToRelative(0.586f)
                lineTo(3.707f, 2.293f)
                lineTo(2.293f, 3.707f)
                lineToRelative(18.0f, 18.0f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(6.0f, 12.0f)
                horizontalLineTo(4.0f)
                curveToRelative(0.0f, 4.072f, 3.06f, 7.436f, 7.0f, 7.931f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.069f)
                arcToRelative(7.935f, 7.935f, 0.0f, false, false, 2.241f, -0.63f)
                lineToRelative(-1.549f, -1.548f)
                arcTo(5.983f, 5.983f, 0.0f, false, true, 12.0f, 18.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.007f, 12.067f)
                arcToRelative(3.996f, 3.996f, 0.0f, false, false, 3.926f, 3.926f)
                lineToRelative(-3.926f, -3.926f)
                close()
            }
        }
        .build()
        return _bxsMicrophoneOff!!
    }

private var _bxsMicrophoneOff: ImageVector? = null
