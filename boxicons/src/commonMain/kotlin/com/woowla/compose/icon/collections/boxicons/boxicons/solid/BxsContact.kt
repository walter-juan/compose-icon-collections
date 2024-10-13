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

public val SolidGroup.BxsContact: ImageVector
    get() {
        if (_bxsContact != null) {
            return _bxsContact!!
        }
        _bxsContact = Builder(name = "BxsContact", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.0f)
                lineTo(6.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 15.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(22.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(13.0f, 4.999f)
                curveToRelative(1.648f, 0.0f, 3.0f, 1.351f, 3.0f, 3.0f)
                arcTo(3.012f, 3.012f, 0.0f, false, true, 13.0f, 11.0f)
                curveToRelative(-1.647f, 0.0f, -3.0f, -1.353f, -3.0f, -3.001f)
                curveToRelative(0.0f, -1.649f, 1.353f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(19.0f, 18.0f)
                lineTo(7.0f, 18.0f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0.0f, -2.219f, 2.705f, -4.5f, 6.0f, -4.5f)
                reflectiveCurveToRelative(6.0f, 2.281f, 6.0f, 4.5f)
                lineTo(19.0f, 18.0f)
                close()
            }
        }
        .build()
        return _bxsContact!!
    }

private var _bxsContact: ImageVector? = null
