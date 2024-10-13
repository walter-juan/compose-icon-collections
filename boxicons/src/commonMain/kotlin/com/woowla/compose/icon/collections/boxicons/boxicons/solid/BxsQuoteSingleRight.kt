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

public val SolidGroup.BxsQuoteSingleRight: ImageVector
    get() {
        if (_bxsQuoteSingleRight != null) {
            return _bxsQuoteSingleRight!!
        }
        _bxsQuoteSingleRight = Builder(name = "BxsQuoteSingleRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.804f, 17.02f)
                lineTo(8.0f, 17.18f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(2.783f, 0.0f, 4.906f, -0.771f, 6.309f, -2.292f)
                curveTo(17.196f, 15.66f, 17.006f, 13.03f, 17.0f, 13.0f)
                verticalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(9.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(4.078f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, true, -0.429f, 1.396f)
                curveToRelative(-0.507f, 0.801f, -1.464f, 1.347f, -2.845f, 1.624f)
                close()
            }
        }
        .build()
        return _bxsQuoteSingleRight!!
    }

private var _bxsQuoteSingleRight: ImageVector? = null
