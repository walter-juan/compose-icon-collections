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

public val RegularGroup.BxWifi: ImageVector
    get() {
        if (_bxWifi != null) {
            return _bxWifi!!
        }
        _bxWifi = Builder(name = "BxWifi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveToRelative(3.537f, 0.0f, 6.837f, 1.353f, 9.293f, 3.809f)
                lineToRelative(1.414f, -1.414f)
                curveTo(19.874f, 5.561f, 16.071f, 4.0f, 12.0f, 4.0f)
                curveToRelative(-4.071f, 0.001f, -7.874f, 1.561f, -10.707f, 4.395f)
                lineToRelative(1.414f, 1.414f)
                curveTo(5.163f, 7.353f, 8.463f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(17.671f, 14.307f)
                curveToRelative(-3.074f, -3.074f, -8.268f, -3.074f, -11.342f, 0.0f)
                lineToRelative(1.414f, 1.414f)
                curveToRelative(2.307f, -2.307f, 6.207f, -2.307f, 8.514f, 0.0f)
                lineToRelative(1.414f, -1.414f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.437f, 11.293f)
                curveToRelative(-4.572f, -4.574f, -12.301f, -4.574f, -16.873f, 0.0f)
                lineToRelative(1.414f, 1.414f)
                curveToRelative(3.807f, -3.807f, 10.238f, -3.807f, 14.045f, 0.0f)
                lineToRelative(1.414f, -1.414f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
        }
        .build()
        return _bxWifi!!
    }

private var _bxWifi: ImageVector? = null
