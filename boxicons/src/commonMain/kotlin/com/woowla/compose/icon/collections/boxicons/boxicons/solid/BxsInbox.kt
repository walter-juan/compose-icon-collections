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

public val SolidGroup.BxsInbox: ImageVector
    get() {
        if (_bxsInbox != null) {
            return _bxsInbox!!
        }
        _bxsInbox = Builder(name = "BxsInbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                lineTo(4.0f, 3.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(22.0f, 5.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(19.0f, 12.0f)
                horizontalLineToRelative(-3.142f)
                curveToRelative(-0.446f, 1.722f, -1.997f, 3.0f, -3.858f, 3.0f)
                reflectiveCurveToRelative(-3.412f, -1.278f, -3.858f, -3.0f)
                lineTo(4.0f, 12.0f)
                lineTo(4.0f, 5.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _bxsInbox!!
    }

private var _bxsInbox: ImageVector? = null
