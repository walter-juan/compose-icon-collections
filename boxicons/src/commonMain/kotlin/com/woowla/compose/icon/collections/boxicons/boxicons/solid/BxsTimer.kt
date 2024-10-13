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

public val SolidGroup.BxsTimer: ImageVector
    get() {
        if (_bxsTimer != null) {
            return _bxsTimer!!
        }
        _bxsTimer = Builder(name = "BxsTimer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(3.0f, 8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 10.0f)
                close()
                moveTo(3.0f, 16.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 18.0f)
                close()
                moveTo(2.0f, 12.0f)
                horizontalLineToRelative(3.99f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 14.0f)
                close()
                moveTo(21.707f, 6.707f)
                lineTo(20.293f, 5.293f)
                lineTo(18.586f, 7.0f)
                arcTo(6.937f, 6.937f, 0.0f, false, false, 15.0f, 6.0f)
                curveToRelative(-3.859f, 0.0f, -7.0f, 3.141f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.141f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.141f, 7.0f, -7.0f)
                arcToRelative(6.968f, 6.968f, 0.0f, false, false, -1.855f, -4.73f)
                lineToRelative(1.562f, -1.563f)
                close()
                moveTo(16.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(14.0f, 8.958f)
                horizontalLineToRelative(2.0f)
                lineTo(16.0f, 14.0f)
                close()
            }
        }
        .build()
        return _bxsTimer!!
    }

private var _bxsTimer: ImageVector? = null
