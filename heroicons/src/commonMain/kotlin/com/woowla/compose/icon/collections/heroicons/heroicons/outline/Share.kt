package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = Builder(name = "Share", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.217f, 10.907f)
                curveTo(6.833f, 10.217f, 6.096f, 9.75f, 5.25f, 9.75f)
                curveTo(4.007f, 9.75f, 3.0f, 10.757f, 3.0f, 12.0f)
                curveTo(3.0f, 13.243f, 4.007f, 14.25f, 5.25f, 14.25f)
                curveTo(6.096f, 14.25f, 6.833f, 13.783f, 7.217f, 13.093f)
                moveTo(7.217f, 10.907f)
                curveTo(7.397f, 11.231f, 7.5f, 11.603f, 7.5f, 12.0f)
                curveTo(7.5f, 12.397f, 7.397f, 12.769f, 7.217f, 13.093f)
                moveTo(7.217f, 10.907f)
                lineTo(16.783f, 5.593f)
                moveTo(7.217f, 13.093f)
                lineTo(16.783f, 18.407f)
                moveTo(16.783f, 18.407f)
                curveTo(16.603f, 18.731f, 16.5f, 19.103f, 16.5f, 19.5f)
                curveTo(16.5f, 20.743f, 17.507f, 21.75f, 18.75f, 21.75f)
                curveTo(19.993f, 21.75f, 21.0f, 20.743f, 21.0f, 19.5f)
                curveTo(21.0f, 18.257f, 19.993f, 17.25f, 18.75f, 17.25f)
                curveTo(17.904f, 17.25f, 17.167f, 17.717f, 16.783f, 18.407f)
                close()
                moveTo(16.783f, 5.593f)
                curveTo(17.167f, 6.283f, 17.904f, 6.75f, 18.75f, 6.75f)
                curveTo(19.993f, 6.75f, 21.0f, 5.743f, 21.0f, 4.5f)
                curveTo(21.0f, 3.257f, 19.993f, 2.25f, 18.75f, 2.25f)
                curveTo(17.507f, 2.25f, 16.5f, 3.257f, 16.5f, 4.5f)
                curveTo(16.5f, 4.897f, 16.603f, 5.269f, 16.783f, 5.593f)
                close()
            }
        }
        .build()
        return _share!!
    }

private var _share: ImageVector? = null
