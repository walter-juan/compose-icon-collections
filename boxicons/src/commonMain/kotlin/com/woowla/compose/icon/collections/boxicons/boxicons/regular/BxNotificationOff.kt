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

public val RegularGroup.BxNotificationOff: ImageVector
    get() {
        if (_bxNotificationOff != null) {
            return _bxNotificationOff!!
        }
        _bxNotificationOff = Builder(name = "BxNotificationOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.71f, 20.296f)
                lineToRelative(-1.786f, -1.786f)
                curveToRelative(0.045f, -0.163f, 0.076f, -0.332f, 0.076f, -0.51f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.586f)
                lineTo(7.414f, 6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-0.178f, 0.0f, -0.347f, 0.031f, -0.51f, 0.076f)
                lineToRelative(-1.78f, -1.78f)
                lineTo(2.296f, 3.71f)
                lineToRelative(18.0f, 18.0f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(4.0f, 8.121f)
                verticalLineTo(18.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(9.879f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-7.879f)
                lineToRelative(-2.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 6.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
        }
        .build()
        return _bxNotificationOff!!
    }

private var _bxNotificationOff: ImageVector? = null
