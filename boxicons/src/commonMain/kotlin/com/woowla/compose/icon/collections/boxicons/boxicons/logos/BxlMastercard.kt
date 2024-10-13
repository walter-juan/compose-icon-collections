package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlMastercard: ImageVector
    get() {
        if (_bxlMastercard != null) {
            return _bxlMastercard!!
        }
        _bxlMastercard = Builder(name = "BxlMastercard", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.454f, 17.021f)
                curveToRelative(0.048f, 0.041f, 0.1f, 0.082f, 0.151f, 0.122f)
                arcToRelative(6.173f, 6.173f, 0.0f, false, true, -3.42f, 1.03f)
                arcTo(6.17f, 6.17f, 0.0f, false, true, 2.01f, 12.0f)
                arcToRelative(6.175f, 6.175f, 0.0f, false, true, 9.592f, -5.144f)
                curveToRelative(-0.05f, 0.043f, -0.1f, 0.082f, -0.138f, 0.126f)
                arcTo(6.633f, 6.633f, 0.0f, false, false, 9.166f, 12.0f)
                curveToRelative(0.0f, 1.925f, 0.833f, 3.755f, 2.288f, 5.021f)
                close()
                moveTo(15.815f, 5.826f)
                arcToRelative(6.14f, 6.14f, 0.0f, false, false, -3.416f, 1.03f)
                curveToRelative(0.049f, 0.043f, 0.099f, 0.082f, 0.137f, 0.126f)
                curveToRelative(1.462f, 1.263f, 2.299f, 3.094f, 2.299f, 5.018f)
                reflectiveCurveToRelative(-0.835f, 3.753f, -2.288f, 5.021f)
                curveToRelative(-0.049f, 0.041f, -0.101f, 0.082f, -0.151f, 0.122f)
                arcToRelative(6.162f, 6.162f, 0.0f, false, false, 3.418f, 1.03f)
                arcToRelative(6.174f, 6.174f, 0.0f, true, false, 0.001f, -12.347f)
                close()
                moveTo(12.0f, 7.15f)
                arcTo(6.152f, 6.152f, 0.0f, false, false, 9.644f, 12.0f)
                arcTo(6.15f, 6.15f, 0.0f, false, false, 12.0f, 16.853f)
                arcTo(6.157f, 6.157f, 0.0f, false, false, 14.357f, 12.0f)
                arcTo(6.15f, 6.15f, 0.0f, false, false, 12.0f, 7.15f)
                close()
            }
        }
        .build()
        return _bxlMastercard!!
    }

private var _bxlMastercard: ImageVector? = null
