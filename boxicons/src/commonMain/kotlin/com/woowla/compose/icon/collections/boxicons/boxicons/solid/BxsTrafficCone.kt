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

public val SolidGroup.BxsTrafficCone: ImageVector
    get() {
        if (_bxsTrafficCone != null) {
            return _bxsTrafficCone!!
        }
        _bxsTrafficCone = Builder(name = "BxsTrafficCone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.649f, 16.0f)
                horizontalLineTo(5.352f)
                lineToRelative(-1.06f, 3.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.292f)
                close()
                moveTo(6.057f, 14.0f)
                horizontalLineToRelative(11.886f)
                lineToRelative(-1.412f, -4.0f)
                horizontalLineTo(7.469f)
                close()
                moveTo(13.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.943f, 0.667f)
                lineTo(8.175f, 8.0f)
                horizontalLineToRelative(7.65f)
                lineToRelative(-1.882f, -5.333f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 2.0f)
                close()
            }
        }
        .build()
        return _bxsTrafficCone!!
    }

private var _bxsTrafficCone: ImageVector? = null
