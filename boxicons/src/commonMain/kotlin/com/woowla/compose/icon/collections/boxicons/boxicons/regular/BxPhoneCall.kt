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

public val RegularGroup.BxPhoneCall: ImageVector
    get() {
        if (_bxPhoneCall != null) {
            return _bxPhoneCall!!
        }
        _bxPhoneCall = Builder(name = "BxPhoneCall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.57f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.43f, -0.59f)
                lineToRelative(2.71f, -2.71f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.41f)
                lineToRelative(-4.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.41f, 0.0f)
                lineToRelative(-1.6f, 1.59f)
                arcToRelative(7.55f, 7.55f, 0.0f, false, true, -3.0f, -1.59f)
                arcToRelative(7.62f, 7.62f, 0.0f, false, true, -1.59f, -3.0f)
                lineToRelative(1.59f, -1.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.41f)
                lineToRelative(-4.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.41f, 0.0f)
                lineTo(2.59f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 7.43f)
                arcTo(15.28f, 15.28f, 0.0f, false, false, 6.3f, 17.7f)
                arcTo(15.28f, 15.28f, 0.0f, false, false, 16.57f, 22.0f)
                close()
                moveTo(6.0f, 5.41f)
                lineTo(8.59f, 8.0f)
                lineTo(7.3f, 9.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.3f, 0.91f)
                arcToRelative(10.12f, 10.12f, 0.0f, false, false, 2.3f, 4.5f)
                arcToRelative(10.08f, 10.08f, 0.0f, false, false, 4.5f, 2.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.91f, -0.27f)
                lineTo(16.0f, 15.41f)
                lineTo(18.59f, 18.0f)
                lineToRelative(-2.0f, 2.0f)
                arcToRelative(13.28f, 13.28f, 0.0f, false, true, -8.87f, -3.71f)
                arcTo(13.28f, 13.28f, 0.0f, false, true, 4.0f, 7.41f)
                close()
                moveTo(20.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(8.81f, 8.81f, 0.0f, false, false, -9.0f, -9.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(6.77f, 6.77f, 0.0f, false, true, 7.0f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 8.0f)
                curveToRelative(2.1f, 0.0f, 3.0f, 0.9f, 3.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -3.22f, -1.78f, -5.0f, -5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _bxPhoneCall!!
    }

private var _bxPhoneCall: ImageVector? = null
