package com.woowla.compose.icon.collections.remix.remix.userandfaces

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.UserAndFacesGroup

public val UserAndFacesGroup.Group3Fill: ImageVector
    get() {
        if (_group3Fill != null) {
            return _group3Fill!!
        }
        _group3Fill = Builder(name = "Group3Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 7.0f)
                curveTo(2.5f, 9.209f, 4.291f, 11.0f, 6.5f, 11.0f)
                curveTo(8.709f, 11.0f, 10.5f, 9.209f, 10.5f, 7.0f)
                curveTo(10.5f, 4.791f, 8.709f, 3.0f, 6.5f, 3.0f)
                curveTo(4.291f, 3.0f, 2.5f, 4.791f, 2.5f, 7.0f)
                close()
                moveTo(2.0f, 21.0f)
                verticalLineTo(16.5f)
                curveTo(2.0f, 14.015f, 4.015f, 12.0f, 6.5f, 12.0f)
                curveTo(8.985f, 12.0f, 11.0f, 14.015f, 11.0f, 16.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(17.5f, 11.0f)
                curveTo(15.291f, 11.0f, 13.5f, 9.209f, 13.5f, 7.0f)
                curveTo(13.5f, 4.791f, 15.291f, 3.0f, 17.5f, 3.0f)
                curveTo(19.709f, 3.0f, 21.5f, 4.791f, 21.5f, 7.0f)
                curveTo(21.5f, 9.209f, 19.709f, 11.0f, 17.5f, 11.0f)
                close()
                moveTo(13.0f, 21.0f)
                verticalLineTo(16.5f)
                curveTo(13.0f, 14.015f, 15.015f, 12.0f, 17.5f, 12.0f)
                curveTo(19.985f, 12.0f, 22.0f, 14.015f, 22.0f, 16.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _group3Fill!!
    }

private var _group3Fill: ImageVector? = null
