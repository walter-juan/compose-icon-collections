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

public val SolidGroup.BxsUserPin: ImageVector
    get() {
        if (_bxsUserPin != null) {
            return _bxsUserPin!!
        }
        _bxsUserPin = Builder(name = "BxsUserPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 2.0f)
                lineTo(5.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(21.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(1.727f, 0.0f, 3.0f, 1.272f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.273f, 3.0f, -3.0f, 3.0f)
                curveToRelative(-1.726f, 0.0f, -3.0f, -1.272f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.274f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(7.177f, 16.0f)
                curveToRelative(0.558f, -1.723f, 2.496f, -3.0f, 4.823f, -3.0f)
                reflectiveCurveToRelative(4.266f, 1.277f, 4.823f, 3.0f)
                lineTo(7.177f, 16.0f)
                close()
            }
        }
        .build()
        return _bxsUserPin!!
    }

private var _bxsUserPin: ImageVector? = null