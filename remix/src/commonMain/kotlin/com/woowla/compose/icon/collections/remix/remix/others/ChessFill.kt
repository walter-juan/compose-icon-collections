package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.ChessFill: ImageVector
    get() {
        if (_chessFill != null) {
            return _chessFill!!
        }
        _chessFill = Builder(name = "ChessFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 16.0f)
                horizontalLineTo(17.808f)
                curveTo(17.41f, 14.185f, 16.343f, 12.853f, 14.147f, 11.911f)
                curveTo(13.927f, 11.817f, 13.81f, 11.571f, 13.885f, 11.344f)
                curveTo(13.952f, 11.144f, 14.15f, 11.017f, 14.361f, 11.041f)
                lineTo(18.846f, 11.551f)
                curveTo(19.243f, 11.596f, 19.628f, 11.4f, 19.827f, 11.053f)
                lineTo(20.653f, 9.608f)
                curveTo(20.861f, 9.243f, 20.819f, 8.787f, 20.548f, 8.466f)
                lineTo(15.5f, 2.5f)
                verticalLineTo(0.287f)
                curveTo(9.336f, 2.84f, 5.0f, 8.913f, 5.0f, 16.0f)
                close()
                moveTo(4.0f, 17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(15.0f, 7.0f)
                curveTo(15.0f, 7.552f, 14.552f, 8.0f, 14.0f, 8.0f)
                curveTo(13.448f, 8.0f, 13.0f, 7.552f, 13.0f, 7.0f)
                curveTo(13.0f, 6.448f, 13.448f, 6.0f, 14.0f, 6.0f)
                curveTo(14.552f, 6.0f, 15.0f, 6.448f, 15.0f, 7.0f)
                close()
            }
        }
        .build()
        return _chessFill!!
    }

private var _chessFill: ImageVector? = null
