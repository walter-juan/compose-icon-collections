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

public val SolidGroup.BxsParking: ImageVector
    get() {
        if (_bxsParking != null) {
            return _bxsParking!!
        }
        _bxsParking = Builder(name = "BxsParking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 3.0f)
                lineTo(5.0f, 3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(4.5f)
                curveToRelative(3.584f, 0.0f, 6.5f, -2.916f, 6.5f, -6.5f)
                reflectiveCurveTo(17.084f, 3.0f, 13.5f, 3.0f)
                close()
                moveTo(13.5f, 12.0f)
                lineTo(9.0f, 12.0f)
                lineTo(9.0f, 7.0f)
                horizontalLineToRelative(4.5f)
                curveTo(14.879f, 7.0f, 16.0f, 8.121f, 16.0f, 9.5f)
                reflectiveCurveTo(14.879f, 12.0f, 13.5f, 12.0f)
                close()
            }
        }
        .build()
        return _bxsParking!!
    }

private var _bxsParking: ImageVector? = null
