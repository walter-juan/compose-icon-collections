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

public val OutlineGroup.VideoCameraSlash: ImageVector
    get() {
        if (_videoCameraSlash != null) {
            return _videoCameraSlash!!
        }
        _videoCameraSlash = Builder(name = "VideoCameraSlash", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.75f, 10.5f)
                lineTo(20.47f, 5.78f)
                curveTo(20.942f, 5.308f, 21.75f, 5.642f, 21.75f, 6.311f)
                verticalLineTo(17.689f)
                curveTo(21.75f, 18.358f, 20.942f, 18.692f, 20.47f, 18.22f)
                lineTo(15.75f, 13.5f)
                moveTo(12.0f, 18.75f)
                horizontalLineTo(4.5f)
                curveTo(3.257f, 18.75f, 2.25f, 17.743f, 2.25f, 16.5f)
                verticalLineTo(9.0f)
                moveTo(15.091f, 18.091f)
                lineTo(16.5f, 19.5f)
                moveTo(15.091f, 18.091f)
                curveTo(15.498f, 17.684f, 15.75f, 17.121f, 15.75f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(15.75f, 6.257f, 14.743f, 5.25f, 13.5f, 5.25f)
                horizontalLineTo(4.5f)
                curveTo(3.879f, 5.25f, 3.316f, 5.502f, 2.909f, 5.909f)
                moveTo(15.091f, 18.091f)
                lineTo(2.909f, 5.909f)
                moveTo(1.5f, 4.5f)
                lineTo(2.909f, 5.909f)
            }
        }
        .build()
        return _videoCameraSlash!!
    }

private var _videoCameraSlash: ImageVector? = null
