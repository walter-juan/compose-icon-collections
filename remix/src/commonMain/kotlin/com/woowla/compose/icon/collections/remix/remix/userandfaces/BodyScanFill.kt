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

public val UserAndFacesGroup.BodyScanFill: ImageVector
    get() {
        if (_bodyScanFill != null) {
            return _bodyScanFill!!
        }
        _bodyScanFill = Builder(name = "BodyScanFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(22.0f, 16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(7.5f, 7.0f)
                curveTo(7.5f, 9.485f, 9.515f, 11.5f, 12.0f, 11.5f)
                curveTo(14.485f, 11.5f, 16.5f, 9.485f, 16.5f, 7.0f)
                horizontalLineTo(18.5f)
                curveTo(18.5f, 9.507f, 17.08f, 11.683f, 15.001f, 12.767f)
                lineTo(15.0f, 19.0f)
                horizontalLineTo(9.0f)
                lineTo(9.0f, 12.768f)
                curveTo(6.92f, 11.684f, 5.5f, 9.508f, 5.5f, 7.0f)
                horizontalLineTo(7.5f)
                close()
                moveTo(12.0f, 5.0f)
                curveTo(13.381f, 5.0f, 14.5f, 6.119f, 14.5f, 7.5f)
                curveTo(14.5f, 8.881f, 13.381f, 10.0f, 12.0f, 10.0f)
                curveTo(10.619f, 10.0f, 9.5f, 8.881f, 9.5f, 7.5f)
                curveTo(9.5f, 6.119f, 10.619f, 5.0f, 12.0f, 5.0f)
                close()
                moveTo(8.0f, 2.0f)
                verticalLineTo(4.0f)
                lineTo(4.0f, 3.999f)
                verticalLineTo(8.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(22.0f, 2.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _bodyScanFill!!
    }

private var _bodyScanFill: ImageVector? = null
