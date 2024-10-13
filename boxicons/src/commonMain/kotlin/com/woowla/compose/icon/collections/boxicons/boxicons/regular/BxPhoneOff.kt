package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxPhoneOff: ImageVector
    get() {
        if (_bxPhoneOff != null) {
            return _bxPhoneOff!!
        }
        _bxPhoneOff = Builder(name = "BxPhoneOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.09f, 12.5f)
                arcToRelative(8.92f, 8.92f, 0.0f, false, true, -1.0f, -2.2f)
                lineToRelative(1.59f, -1.59f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.42f)
                lineToRelative(-4.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.41f, 0.0f)
                lineTo(2.59f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 7.44f)
                arcTo(15.44f, 15.44f, 0.0f, false, false, 5.62f, 17.0f)
                lineTo(2.3f, 20.29f)
                lineToRelative(1.41f, 1.42f)
                lineToRelative(18.0f, -18.0f)
                lineToRelative(-1.41f, -1.42f)
                close()
                moveTo(7.0f, 15.55f)
                arcToRelative(13.36f, 13.36f, 0.0f, false, true, -3.0f, -8.13f)
                lineToRelative(2.0f, -2.0f)
                lineTo(8.59f, 8.0f)
                lineTo(7.3f, 9.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.27f, 0.92f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, 1.62f, 3.73f)
                close()
                moveTo(16.71f, 13.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.41f, 0.0f)
                lineToRelative(-1.6f, 1.6f)
                lineToRelative(-0.34f, -0.12f)
                lineToRelative(-1.56f, 1.55f)
                arcToRelative(12.06f, 12.06f, 0.0f, false, false, 2.0f, 0.66f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.91f, -0.27f)
                lineToRelative(1.3f, -1.3f)
                lineTo(18.59f, 18.0f)
                lineToRelative(-2.0f, 2.0f)
                arcTo(13.61f, 13.61f, 0.0f, false, true, 10.0f, 18.1f)
                lineToRelative(-1.43f, 1.45f)
                arcToRelative(15.63f, 15.63f, 0.0f, false, false, 8.0f, 2.45f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.43f, -0.58f)
                lineToRelative(2.71f, -2.71f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.42f)
                close()
            }
        }
        .build()
        return _bxPhoneOff!!
    }

private var _bxPhoneOff: ImageVector? = null
