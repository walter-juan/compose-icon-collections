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

public val SolidGroup.BxsVolumeMute: ImageVector
    get() {
        if (_bxsVolumeMute != null) {
            return _bxsVolumeMute!!
        }
        _bxsVolumeMute = Builder(name = "BxsVolumeMute", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.727f, 6.313f)
                lineToRelative(-4.02f, -4.02f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(18.0f, 18.0f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.02f, -2.02f)
                arcTo(9.578f, 9.578f, 0.0f, false, false, 21.999f, 12.0f)
                curveToRelative(0.0f, -4.091f, -2.472f, -7.453f, -5.999f, -9.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(2.387f, 1.386f, 3.999f, 4.047f, 3.999f, 7.0f)
                arcToRelative(8.13f, 8.13f, 0.0f, false, true, -1.671f, 4.914f)
                lineToRelative(-1.286f, -1.286f)
                curveTo(17.644f, 14.536f, 18.0f, 13.19f, 18.0f, 12.0f)
                curveToRelative(0.0f, -1.771f, -0.775f, -3.9f, -2.0f, -5.0f)
                verticalLineToRelative(7.586f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineTo(2.132f)
                lineTo(7.727f, 6.313f)
                close()
                moveTo(4.0f, 17.0f)
                horizontalLineToRelative(2.697f)
                lineTo(14.0f, 21.868f)
                verticalLineToRelative(-3.747f)
                lineTo(3.102f, 7.223f)
                arcTo(1.995f, 1.995f, 0.0f, false, false, 2.0f, 9.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _bxsVolumeMute!!
    }

private var _bxsVolumeMute: ImageVector? = null
