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

public val SolidGroup.BxsMagicWand: ImageVector
    get() {
        if (_bxsMagicWand != null) {
            return _bxsMagicWand!!
        }
        _bxsMagicWand = Builder(name = "BxsMagicWand", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 4.0f)
                lineToRelative(-0.5f, -1.0f)
                lineToRelative(-0.5f, 1.0f)
                lineToRelative(-1.0f, 0.125f)
                lineToRelative(0.834f, 0.708f)
                lineTo(9.5f, 6.0f)
                lineToRelative(1.0f, -0.666f)
                lineToRelative(1.0f, 0.666f)
                lineToRelative(-0.334f, -1.167f)
                lineToRelative(0.834f, -0.708f)
                close()
                moveTo(19.334f, 14.666f)
                lineTo(18.5f, 13.0f)
                lineToRelative(-0.834f, 1.666f)
                lineToRelative(-1.666f, 0.209f)
                lineToRelative(1.389f, 1.181f)
                lineTo(16.834f, 18.0f)
                lineToRelative(1.666f, -1.111f)
                lineTo(20.166f, 18.0f)
                lineToRelative(-0.555f, -1.944f)
                lineTo(21.0f, 14.875f)
                close()
                moveTo(6.667f, 6.333f)
                lineTo(6.0f, 5.0f)
                lineToRelative(-0.667f, 1.333f)
                lineTo(4.0f, 6.5f)
                lineToRelative(1.111f, 0.944f)
                lineTo(4.667f, 9.0f)
                lineTo(6.0f, 8.111f)
                lineTo(7.333f, 9.0f)
                lineToRelative(-0.444f, -1.556f)
                lineTo(8.0f, 6.5f)
                close()
                moveTo(3.414f, 17.0f)
                curveToRelative(0.0f, 0.534f, 0.208f, 1.036f, 0.586f, 1.414f)
                lineTo(5.586f, 20.0f)
                curveToRelative(0.378f, 0.378f, 0.88f, 0.586f, 1.414f, 0.586f)
                reflectiveCurveToRelative(1.036f, -0.208f, 1.414f, -0.586f)
                lineTo(20.0f, 8.414f)
                curveToRelative(0.378f, -0.378f, 0.586f, -0.88f, 0.586f, -1.414f)
                reflectiveCurveTo(20.378f, 5.964f, 20.0f, 5.586f)
                lineTo(18.414f, 4.0f)
                curveToRelative(-0.756f, -0.756f, -2.072f, -0.756f, -2.828f, 0.0f)
                lineTo(4.0f, 15.586f)
                curveToRelative(-0.378f, 0.378f, -0.586f, 0.88f, -0.586f, 1.414f)
                close()
                moveTo(17.0f, 5.414f)
                lineTo(18.586f, 7.0f)
                lineTo(15.0f, 10.586f)
                lineTo(13.414f, 9.0f)
                lineTo(17.0f, 5.414f)
                close()
            }
        }
        .build()
        return _bxsMagicWand!!
    }

private var _bxsMagicWand: ImageVector? = null
