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

public val RegularGroup.BxTrafficCone: ImageVector
    get() {
        if (_bxTrafficCone != null) {
            return _bxTrafficCone!!
        }
        _bxTrafficCone = Builder(name = "BxTrafficCone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.943f, 2.667f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.943f, 0.667f)
                lineTo(4.292f, 19.0f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.292f)
                lineTo(13.943f, 2.667f)
                close()
                moveTo(15.47f, 13.0f)
                lineTo(8.53f, 13.0f)
                lineToRelative(1.06f, -3.0f)
                horizontalLineToRelative(4.82f)
                lineToRelative(1.06f, 3.0f)
                close()
                moveTo(11.707f, 4.0f)
                horizontalLineToRelative(0.586f)
                lineToRelative(1.412f, 4.0f)
                horizontalLineToRelative(-3.41f)
                lineToRelative(1.412f, -4.0f)
                close()
                moveTo(7.825f, 15.0f)
                horizontalLineToRelative(8.35f)
                lineToRelative(1.412f, 4.0f)
                lineTo(6.413f, 19.0f)
                lineToRelative(1.412f, -4.0f)
                close()
            }
        }
        .build()
        return _bxTrafficCone!!
    }

private var _bxTrafficCone: ImageVector? = null
