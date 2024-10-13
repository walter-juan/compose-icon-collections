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

public val SolidGroup.BxsPhoneOff: ImageVector
    get() {
        if (_bxsPhoneOff != null) {
            return _bxsPhoneOff!!
        }
        _bxsPhoneOff = Builder(name = "BxsPhoneOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.17f, 13.42f)
                arcToRelative(5.24f, 5.24f, 0.0f, false, true, -0.93f, -2.06f)
                lineTo(10.7f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.39f)
                lineToRelative(-3.65f, -4.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, -0.08f)
                lineTo(3.48f, 5.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.29f, 0.65f)
                arcToRelative(15.25f, 15.25f, 0.0f, false, false, 3.54f, 9.92f)
                lineToRelative(-4.44f, 4.43f)
                lineToRelative(1.42f, 1.42f)
                lineToRelative(18.0f, -18.0f)
                lineToRelative(-1.42f, -1.42f)
                close()
                moveTo(16.61f, 13.44f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.39f, 0.05f)
                lineTo(12.82f, 16.0f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, true, -0.51f, -0.14f)
                lineToRelative(-2.66f, 2.61f)
                arcTo(15.46f, 15.46f, 0.0f, false, false, 17.89f, 21.0f)
                horizontalLineToRelative(0.36f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.65f, -0.29f)
                lineToRelative(1.86f, -2.17f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.09f, -1.39f)
                close()
            }
        }
        .build()
        return _bxsPhoneOff!!
    }

private var _bxsPhoneOff: ImageVector? = null
