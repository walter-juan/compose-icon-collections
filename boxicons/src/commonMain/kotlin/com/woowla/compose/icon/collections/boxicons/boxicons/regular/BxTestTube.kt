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

public val RegularGroup.BxTestTube: ImageVector
    get() {
        if (_bxTestTube != null) {
            return _bxTestTube!!
        }
        _bxTestTube = Builder(name = "BxTestTube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.293f, 2.707f)
                lineToRelative(0.818f, 0.818f)
                lineTo(3.318f, 14.318f)
                curveTo(2.468f, 15.168f, 2.0f, 16.298f, 2.0f, 17.5f)
                reflectiveCurveToRelative(0.468f, 2.332f, 1.318f, 3.183f)
                curveTo(4.169f, 21.532f, 5.299f, 22.0f, 6.5f, 22.0f)
                reflectiveCurveToRelative(2.331f, -0.468f, 3.182f, -1.318f)
                lineTo(20.475f, 9.889f)
                lineToRelative(0.818f, 0.818f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-8.0f, -8.0f)
                lineToRelative(-1.414f, 1.414f)
                close()
                moveTo(16.475f, 11.061f)
                lineTo(14.072f, 8.657f)
                lineTo(12.658f, 10.071f)
                lineTo(15.061f, 12.475f)
                lineTo(13.647f, 13.89f)
                lineTo(12.657f, 12.9f)
                lineTo(11.243f, 14.314f)
                lineTo(12.233f, 15.304f)
                lineTo(10.818f, 16.719f)
                lineTo(8.415f, 14.315f)
                lineTo(7.0f, 15.728f)
                lineToRelative(2.403f, 2.404f)
                lineToRelative(-1.136f, 1.136f)
                curveToRelative(-0.945f, 0.944f, -2.59f, 0.944f, -3.535f, 0.0f)
                curveTo(4.26f, 18.795f, 4.0f, 18.168f, 4.0f, 17.5f)
                reflectiveCurveToRelative(0.26f, -1.295f, 0.732f, -1.768f)
                lineTo(15.525f, 4.939f)
                lineToRelative(3.535f, 3.535f)
                lineToRelative(-2.585f, 2.587f)
                close()
            }
        }
        .build()
        return _bxTestTube!!
    }

private var _bxTestTube: ImageVector? = null
