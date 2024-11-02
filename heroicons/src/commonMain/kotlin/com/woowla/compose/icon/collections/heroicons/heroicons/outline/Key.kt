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

public val OutlineGroup.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.75f, 5.25f)
                curveTo(17.407f, 5.25f, 18.75f, 6.593f, 18.75f, 8.25f)
                moveTo(21.75f, 8.25f)
                curveTo(21.75f, 11.564f, 19.064f, 14.25f, 15.75f, 14.25f)
                curveTo(15.399f, 14.25f, 15.056f, 14.22f, 14.721f, 14.162f)
                curveTo(14.158f, 14.065f, 13.562f, 14.188f, 13.158f, 14.592f)
                lineTo(10.5f, 17.25f)
                horizontalLineTo(8.25f)
                verticalLineTo(19.5f)
                horizontalLineTo(6.0f)
                verticalLineTo(21.75f)
                horizontalLineTo(2.25f)
                verticalLineTo(18.932f)
                curveTo(2.25f, 18.335f, 2.487f, 17.763f, 2.909f, 17.341f)
                lineTo(9.408f, 10.842f)
                curveTo(9.812f, 10.438f, 9.935f, 9.842f, 9.838f, 9.279f)
                curveTo(9.78f, 8.944f, 9.75f, 8.601f, 9.75f, 8.25f)
                curveTo(9.75f, 4.936f, 12.436f, 2.25f, 15.75f, 2.25f)
                curveTo(19.064f, 2.25f, 21.75f, 4.936f, 21.75f, 8.25f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null
