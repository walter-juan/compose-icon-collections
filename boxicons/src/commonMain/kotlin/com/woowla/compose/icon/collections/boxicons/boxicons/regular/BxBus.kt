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

public val RegularGroup.BxBus: ImageVector
    get() {
        if (_bxBus != null) {
            return _bxBus!!
        }
        _bxBus = Builder(name = "BxBus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.004f, 7.975f)
                lineTo(21.004f, 6.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                horizontalLineToRelative(-10.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(1.998f)
                lineToRelative(-0.076f, 0.004f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 9.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(0.004f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.735f, 0.403f, 1.372f, 0.996f, 1.72f)
                lineTo(4.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.276f)
                arcTo(1.994f, 1.994f, 0.0f, false, false, 21.004f, 18.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(22.004f, 9.062f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, false, -0.072f, -0.455f)
                curveToRelative(-0.203f, -0.487f, -0.635f, -0.604f, -0.928f, -0.632f)
                close()
                moveTo(19.006f, 18.0f)
                lineTo(5.004f, 18.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(14.001f)
                lineToRelative(0.001f, 5.0f)
                close()
                moveTo(11.004f, 7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(5.004f, 7.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(19.004f, 7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(13.004f, 7.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(7.004f, 4.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.736f, 0.0f, 1.375f, 0.405f, 1.722f, 1.0f)
                lineTo(5.282f, 5.0f)
                curveToRelative(0.347f, -0.595f, 0.986f, -1.0f, 1.722f, -1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 15.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 15.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
        }
        .build()
        return _bxBus!!
    }

private var _bxBus: ImageVector? = null
