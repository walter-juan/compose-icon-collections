package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.HouseUser: ImageVector
    get() {
        if (_houseUser != null) {
            return _houseUser!!
        }
        _houseUser = Builder(name = "HouseUser", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(575.8f, 255.5f)
                curveToRelative(0.0f, 18.0f, -15.0f, 32.1f, -32.0f, 32.1f)
                lineToRelative(-32.0f, 0.0f)
                lineToRelative(0.7f, 160.2f)
                curveToRelative(0.2f, 35.5f, -28.5f, 64.3f, -64.0f, 64.3f)
                lineToRelative(-320.4f, 0.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineToRelative(0.0f, -160.4f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-18.0f, 0.0f, -32.0f, -14.0f, -32.0f, -32.1f)
                curveToRelative(0.0f, -9.0f, 3.0f, -17.0f, 10.0f, -24.0f)
                lineTo(266.4f, 8.0f)
                curveToRelative(7.0f, -7.0f, 15.0f, -8.0f, 22.0f, -8.0f)
                reflectiveCurveToRelative(15.0f, 2.0f, 21.0f, 7.0f)
                lineTo(564.8f, 231.5f)
                curveToRelative(8.0f, 7.0f, 12.0f, 15.0f, 11.0f, 24.0f)
                close()
                moveTo(352.0f, 224.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, -128.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 128.0f, 0.0f)
                close()
                moveTo(256.0f, 320.0f)
                curveToRelative(-44.2f, 0.0f, -80.0f, 35.8f, -80.0f, 80.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(192.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                curveToRelative(0.0f, -44.2f, -35.8f, -80.0f, -80.0f, -80.0f)
                lineToRelative(-64.0f, 0.0f)
                close()
            }
        }
        .build()
        return _houseUser!!
    }

private var _houseUser: ImageVector? = null
