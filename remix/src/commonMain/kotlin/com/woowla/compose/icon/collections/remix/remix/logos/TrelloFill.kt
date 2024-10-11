package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.TrelloFill: ImageVector
    get() {
        if (_trelloFill != null) {
            return _trelloFill!!
        }
        _trelloFill = Builder(name = "TrelloFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.251f, 3.0f)
                horizontalLineTo(18.751f)
                curveTo(19.993f, 3.0f, 21.001f, 4.007f, 21.001f, 5.25f)
                verticalLineTo(18.75f)
                curveTo(21.001f, 19.992f, 19.993f, 21.0f, 18.751f, 21.0f)
                horizontalLineTo(5.251f)
                curveTo(4.009f, 21.0f, 3.001f, 19.993f, 3.001f, 18.75f)
                verticalLineTo(5.25f)
                curveTo(3.001f, 4.008f, 4.008f, 3.0f, 5.251f, 3.0f)
                close()
                moveTo(13.171f, 6.421f)
                verticalLineTo(12.179f)
                curveTo(13.171f, 12.776f, 13.655f, 13.26f, 14.251f, 13.26f)
                horizontalLineTo(17.581f)
                curveTo(18.178f, 13.26f, 18.661f, 12.776f, 18.661f, 12.179f)
                verticalLineTo(6.421f)
                curveTo(18.661f, 5.824f, 18.177f, 5.34f, 17.581f, 5.34f)
                horizontalLineTo(14.251f)
                curveTo(13.654f, 5.34f, 13.171f, 5.823f, 13.171f, 6.421f)
                close()
                moveTo(5.341f, 6.42f)
                verticalLineTo(16.68f)
                curveTo(5.341f, 17.276f, 5.825f, 17.76f, 6.421f, 17.76f)
                horizontalLineTo(9.751f)
                curveTo(10.348f, 17.76f, 10.831f, 17.277f, 10.831f, 16.68f)
                verticalLineTo(6.42f)
                curveTo(10.831f, 5.824f, 10.347f, 5.34f, 9.751f, 5.34f)
                horizontalLineTo(6.421f)
                curveTo(5.824f, 5.34f, 5.341f, 5.823f, 5.341f, 6.42f)
                close()
            }
        }
        .build()
        return _trelloFill!!
    }

private var _trelloFill: ImageVector? = null
